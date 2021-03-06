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
package com.gisgraphy.domain.valueobject;

import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gisgraphy.domain.geoloc.service.geoloc.street.StreetType;
import com.vividsolutions.jts.geom.Point;

/**
 * Value object that represents a StreetOSM with a distance The JAXB node name
 * is {@link Constants#STREETDISTANCE_JAXB_NAME}
 * 
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 */
@XmlRootElement(name = Constants.STREETDISTANCE_JAXB_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class StreetDistance {

	public static class StreetDistanceBuilder {

		public static StreetDistanceBuilder streetDistance() {
			return new StreetDistanceBuilder();
		}

		private final StreetDistance streetDistance;

		private StreetDistanceBuilder() {
			streetDistance = new StreetDistance();
		}

		public StreetDistance build() {

			streetDistance.updateFields();
			return streetDistance;
		}

		public StreetDistanceBuilder withName(String name) {
			streetDistance.name = name;
			return this;
		}

		public StreetDistanceBuilder withLocation(Point location) {
			streetDistance.location = location;
			return this;
		}

		public StreetDistanceBuilder withDistance(Double distance) {
			streetDistance.distance = distance;
			return this;
		}

		public StreetDistanceBuilder withGid(Long gid) {
			streetDistance.gid = gid;
			return this;
		}

		public StreetDistanceBuilder withStreetType(StreetType streetType) {
			streetDistance.streetType = streetType;
			return this;
		}

		public StreetDistanceBuilder withOneWay(Boolean oneWay) {
			streetDistance.oneWay = oneWay;
			return this;
		}

		public StreetDistanceBuilder withLength(Double length) {
			streetDistance.length = length;
			return this;
		}

		public StreetDistanceBuilder withCountryCode(String countryCode) {
			if (countryCode != null) {
				streetDistance.countryCode = countryCode.toUpperCase();
			}
			return this;
		}

	}

	@XmlTransient
	@Transient
	protected static final Logger logger = LoggerFactory
			.getLogger(StreetDistance.class);

	private String name;

	@XmlTransient
	@Transient
	private Point location;

	private Double distance;

	private Long gid;

	private StreetType streetType;

	private Boolean oneWay;

	private String countryCode;

	private Double length;

	private Double lat;

	private Double lng;

	/**
	 * Default Constructor needed by cglib
	 */
	public StreetDistance() {
		super();
	}

	/**
	 * update the calculated fields (lat,lng,...)
	 * 
	 */
	public void updateFields() {
		if (this.location != null) {
			this.lat = location.getY();
			this.lng = location.getX();
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the distance
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * @return the gid
	 */
	public Long getGid() {
		return gid;
	}

	/**
	 * @return the streetType
	 */
	public StreetType getStreetType() {
		return streetType;
	}

	/**
	 * @return the oneWay
	 */
	public Boolean getOneWay() {
		return oneWay;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}

	/**
	 * @return the lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * @return the lng
	 */
	public Double getLng() {
		return lng;
	}

	/**
	 * @return the location
	 */
	@Transient
	@XmlTransient
	public Point getLocation() {
		return this.location;
	}

}
