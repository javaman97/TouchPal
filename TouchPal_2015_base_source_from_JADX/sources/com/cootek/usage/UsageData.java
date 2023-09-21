package com.cootek.usage;

import java.io.Serializable;

class UsageData implements Serializable {
    private static final long serialVersionUID = 1;
    String path;
    String type;
    String value;

    UsageData() {
    }
}
