package cho.carbon.hc.copframe.web.poll;

@FunctionalInterface
public interface ConsumerThrowException<T> {
	void accept(T arg) throws Exception;
}
