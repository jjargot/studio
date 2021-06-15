package com.support.bonitasoft.groovy.ids;

import com.support.bonitasoft.groovy.StringsConstants;

final class IdsConstants {
	static long getFourLong() {
		return Long.parseLong(StringsConstants.getFourString());
	}
}
