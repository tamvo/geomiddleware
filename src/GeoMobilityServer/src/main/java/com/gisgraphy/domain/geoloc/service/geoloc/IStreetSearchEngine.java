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
package com.gisgraphy.domain.geoloc.service.geoloc;

import com.gisgraphy.domain.geoloc.service.IQueryProcessor;
import com.gisgraphy.domain.geoloc.service.ServiceException;
import com.gisgraphy.domain.valueobject.StreetSearchResultsDto;

/**
 * Execute a {@linkplain StreetSearchQuery} and returns the results in a specific
 * format
 * 
 * @see StreetSearchQuery
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 */
public interface IStreetSearchEngine extends IQueryProcessor<StreetSearchQuery> {

    /**
     * Execute the query and returns a {@link StreetSearchResultsDto}
     * 
     * @param query
     *                The {@link StreetSearchQuery} to execute
     * @return The StreetSearchResultsDto Objects.
     * @throws ServiceException
     *                 If an error occurred
     */
    public StreetSearchResultsDto executeQuery(StreetSearchQuery query)
	    throws ServiceException;

}
