/*******************************************************************************
 *   Gisgraphy Project 
 * 
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 * 
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *   Lesser General Public License for more details.
 * 
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 * 
 *  Copyright 2008  Gisgraphy project 
 *  David Masclet <davidmasclet@gisgraphy.com>
 *  
 *  
 *******************************************************************************/

package com.gisgraphy.hibernate.criterion;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.engine.TypedValue;

import com.gisgraphy.domain.valueobject.SRID;
import com.vividsolutions.jts.geom.Polygon;

/**
 * An implementation of the <code>Criterion</code> interface that implements
 * restriction for a psql intersects restriction
 * 
 * Because the point store in OSM with a form: "POINT(y x)"
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 * @author <a href="mailto:vo.mita.ov@gmail.com">VoMinhTam</a>
 */
public class IntersectsRestrictionOSM implements Criterion {

	private Polygon polygon;

	private String columnName;

	private boolean isXY = false;

	private static final long serialVersionUID = 1L;

	/**
	 * @param columnName
	 *            the name of the column that hold GIS information (typically
	 *            shape column)
	 * @param polygon
	 *            The shape we want to see if the column data intersects
	 */
	public IntersectsRestrictionOSM(String columnName, Polygon polygon) {
		if (columnName == null) {
			throw new IllegalArgumentException(
					"collumname is required  for IntersectsRestriction");
		}
		if (polygon == null) {
			throw new IllegalArgumentException(
					"polygon is required  for IntersectsRestriction");
		}
		this.columnName = columnName;
		this.polygon = polygon;
	}

	public IntersectsRestrictionOSM(String columnName, Polygon polygon,
			boolean isXY) {
		this(columnName, polygon);
		this.isXY = isXY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.hibernate.criterion.Criterion#getTypedValues(org.hibernate.Criteria,
	 * org.hibernate.criterion.CriteriaQuery)
	 */
//	public TypedValue[] getTypedValues(Criteria criteria,
//			CriteriaQuery criteriaQuery) throws HibernateException {
//		return new TypedValue[] { criteriaQuery.getTypedValue(criteria,
//				GisFeature.LOCATION_COLUMN_NAME, polygon) };
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.hibernate.criterion.Criterion#toSqlString(org.hibernate.Criteria,
	 * org.hibernate.criterion.CriteriaQuery)
	 */
	public String toSqlString(Criteria criteria, CriteriaQuery criteriaQuery)
			throws HibernateException {
		// Tam
		String columnName = criteriaQuery.getColumn(criteria, this.columnName);
		if (!isXY)
			columnName = "GeometryFromText(" + columnName + ","
					+ SRID.WGS84_SRID.getSRID() + ")";
		else
			columnName = "GeometryFromText(ST_Transform(" + columnName + ","
					+ SRID.WGS84_SRID.getSRID() + "), " + SRID.WGS84_SRID.getSRID() + ")";

		StringBuffer result = new StringBuffer(columnName).append(" && ")
		.append(
				"GeometryFromText( %s ," + SRID.WGS84_SRID.getSRID()
						+ ")");
		
		// String columnName = criteriaQuery.getColumn(criteria,
		// this.columnName);
		// StringBuffer result = new StringBuffer(columnName).append(" && ")
		// .append(" ? ");
		return String.format(result.toString(),polygon.toString()).toString();
	}

	public TypedValue[] getTypedValues(Criteria criteria,
			CriteriaQuery criteriaQuery) throws HibernateException {
		return new TypedValue[0];
	}
}
