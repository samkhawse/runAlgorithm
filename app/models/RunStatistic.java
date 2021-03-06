package models;

public class RunStatistic implements Comparable<RunStatistic> {

	/*
	 * {"version":1, 
	 * "timestamp":"2012-03-17 09:31:37 +0100", 
	 * "heart_rate":121,
	 * "signal_strength":100, 
	 * "duration":0, 
	 * "distance":0}
	 */

	private Long version;

	private String timestamp;

	private Integer heart_rate;

	private Integer signalStrength;

	private Integer duration;

	private Long distance;

	@Override
	public int compareTo(RunStatistic comparator) {

		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;

		if (this == comparator)
			return EQUAL;

		if (this.duration < comparator.duration)
			return BEFORE;
		else
			return AFTER;

	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getHeartRate() {
		return heart_rate;
	}

	public void setHeartRate(Integer heartRate) {
		this.heart_rate = heartRate;
	}

	public Integer getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Long getDistance() {
		return distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

}
