package problems.impl.problem54.model.rank;

import com.google.common.collect.ImmutableList;

public final class HandRank implements Comparable<HandRank> {

	private final Rank rank;
	private final ImmutableList<Integer> values;
	
	public HandRank(Rank rank, ImmutableList<Integer> values) {
		this.rank = rank;
		this.values = values;
	}
	
	public Rank getRank() {
		return rank;
	}

	public ImmutableList<Integer> getValues() {
		return values;
	}

	@Override
	public int compareTo(HandRank that) {
		if (this.rank.compareTo(that.rank) > 0) {
			return 1;
		} else if (this.rank.compareTo(that.rank) < 0) {
			return -1;
		} else {
			int i = 0;
			while (i < this.values.size() && i < that.values.size()) {
				if (this.values.get(i) > that.values.get(i)) {
					return 1;
				} else if (this.values.get(i) < that.values.get(i)) {
					return -1;
				} else {
					i++;
				}
			}
			return 0;
		}
	}

}
