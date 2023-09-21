package com.cootek.smartinput5.engine;

import java.util.ArrayList;
import java.util.Iterator;

public class VerboseManager {
    ArrayList<IVerboseListener> observers = new ArrayList<>();

    public interface IVerboseListener {
        void onOperationFinished();
    }

    public void registerListener(IVerboseListener iVerboseListener) {
        if (iVerboseListener != null && !this.observers.contains(iVerboseListener)) {
            this.observers.add(iVerboseListener);
            iVerboseListener.onOperationFinished();
        }
    }

    public void removeAllListener() {
        this.observers.clear();
    }

    public void update() {
        Iterator<IVerboseListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onOperationFinished();
        }
    }
}
