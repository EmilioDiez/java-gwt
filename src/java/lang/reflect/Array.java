package java.lang.reflect;


public class Array {

    /**
     * Returns whether the given object i a javascript array.
     *
     * @param object The object to be checked.
     * @return <code>true</code> if the given object is a javascript array, <code>false</code> otherwise.
     */
    public native static boolean isArray(Object object) /*-{
        return object instanceof Array;
    }-*/;

    /**
     * Returns the i'th item in the given javascript array.
     *
     * @param array The given javascript array.
     * @param i The index of the item to be returned.
     * @return The item in the i'th position in the given array.
     */
    public native static Object get(Object array, int i) /*-{
        return array[i];
    }-*/;

    /**
     * Returns the length of the given javascript array.
     *
     * @param array The given javascript array.
     * @return The length of the given array.
     */
    public native static int getLength(Object array) /*-{
        return array.length;
    }-*/;



    
}
