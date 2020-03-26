package cho.carbon.hc.copframe.dao.deferedQuery;

public interface Function<T, R> {
	R apply(T var1);
}