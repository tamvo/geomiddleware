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
/**
 *
 */
package com.gisgraphy.domain.geoloc.service.geoloc;

import com.gisgraphy.domain.geoloc.service.ServiceException;

/**
 * Basic Exception for geoloc search
 * 
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 */
public class GeolocSearchException extends ServiceException {

    /**
     * Default serial id
     */
    private static final long serialVersionUID = 7437638905733292244L;

    /**
     * Default Constructor
     */
    public GeolocSearchException() {
	super();
    }

    /**
     * @param message
     *                The message
     * @param cause
     *                The cause
     */
    public GeolocSearchException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     *                The message
     */
    public GeolocSearchException(String message) {
	super(message);
    }

    /**
     * @param cause
     *                The cause
     */
    public GeolocSearchException(Throwable cause) {
	super(cause);
    }

}
