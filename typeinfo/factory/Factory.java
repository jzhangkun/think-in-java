package typeinfo.factory;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 9/12/16
 * Time: 8:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Factory<T> {
    T create();
}
