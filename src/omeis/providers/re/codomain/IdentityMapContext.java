/*
 * omeis.providers.re.codomain.IdentityMapContext
 *
 *   Copyright 2006 University of Dundee. All rights reserved.
 *   Use is subject to license terms supplied in LICENSE.txt
 */

package omeis.providers.re.codomain;


//Java imports

//Third-party libraries

//Application-internal dependencies

/** 
 * An empty context for the identity map.
 *
 * @author  Jean-Marie Burel &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:j.burel@dundee.ac.uk">j.burel@dundee.ac.uk</a>
 * @author  <br>Andrea Falconi &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:a.falconi@dundee.ac.uk">
 * 					a.falconi@dundee.ac.uk</a>
 * @version 2.2
 * <small>
 * (<b>Internal version:</b> $Revision: 1.2 $ $Date: 2005/06/12 23:29:38 $)
 * </small>
 * @since OME2.2
 */
public class IdentityMapContext 
	extends CodomainMapContext
{

	/** 
	 * Implemented as specified by superclass.
	 * @see CodomainMapContext#buildContext()
	 */
	void buildContext() {}

	/** 
	 * Implemented as specified by superclass.
	 * @see CodomainMapContext#getCodomainMap()
	 */
	CodomainMap getCodomainMap() { return new IdentityMap(); }

	/** 
	 * Implemented as specified by superclass.
	 * @see CodomainMapContext#copy()
	 */
	public CodomainMapContext copy()  
    {
        IdentityMapContext copy = new IdentityMapContext();
        copy.intervalEnd = intervalEnd;
        copy.intervalStart = intervalStart;
        return copy; 
    }

}
