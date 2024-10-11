
public class AdapterImpl implements Adapter {

//	Math math;
	@Override
	public Float twiceOf(Float f) {
		
		return (float)(f.doubleValue()*2);
	}

	@Override
	public Float halfOf(Float f) {
		return (float)(f.doubleValue()/2);
	}

}
