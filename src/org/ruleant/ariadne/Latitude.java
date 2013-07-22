/**
 * Class for formatting latitude.
 *
 * Copyright (C) 2012-2013 Dieter Adriaenssens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @package org.ruleant.ariadne
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
package org.ruleant.ariadne;

/**
 * Class for formatting latitude.
 *
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
public class Latitude extends AbstractGeoCoordinate{
    /**
     * Segment North
     */
    public static final int SEGMENT_NORTH = 1;

    /**
     * Segment South
     */
    public static final int SEGMENT_SOUTH = 2;

    /**
     * Determine value segment, North if latitude is in the range 0..90,
     * South if latitude is in the range -90..0.
     *
     * @return segment code : SEGMENT_NORTH or SEGMENT_SOUTH
     */
    public final int getSegment() {
        return 0;
    }
}
