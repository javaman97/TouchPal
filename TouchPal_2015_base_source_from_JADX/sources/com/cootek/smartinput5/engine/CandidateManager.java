package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.func.C1389aD;
import java.util.ArrayList;
import java.util.Iterator;

public class CandidateManager {
    public static final int CANDIDATE = 0;
    public static final int DIALECT = 2;
    private static final String TAG = "CandidateManager";
    public static final int TYPE_COUNT = 3;
    public static final int USERWORD = 1;
    private static boolean simpleCandidate = false;
    private ICandidateProvider candidates;
    private ICandidateProvider dialects;
    private boolean hasDeferedUpdate = false;
    private ArrayList<ICandidateListener> observers;
    private boolean updateEnabled = true;
    private ICandidateProvider userwords;

    public interface ICandidateListener {
        void onCandidateUpdated(boolean z, ICandidateProvider iCandidateProvider, boolean z2, ICandidateProvider iCandidateProvider2, boolean z3, ICandidateProvider iCandidateProvider3, boolean z4);
    }

    public interface ICandidateProvider {
        public static final int CANDIDATE = 0;
        public static final int DIALECT = 2;
        public static final int USERWORD = 1;

        CandidateItem get(int i);

        int getFirstIndex();

        int getProviderType();

        boolean hasCandidates();

        void reset();
    }

    public boolean hasCandidates() {
        if (this.candidates != null) {
            return this.candidates.hasCandidates();
        }
        return false;
    }

    public boolean hasUserWords() {
        if (this.userwords != null) {
            return this.userwords.hasCandidates();
        }
        return false;
    }

    public boolean hasDialect() {
        if (this.dialects != null) {
            return this.dialects.hasCandidates();
        }
        return false;
    }

    public CandidateManager(Engine engine, ICandidateProvider iCandidateProvider, ICandidateProvider iCandidateProvider2, ICandidateProvider iCandidateProvider3) {
        this.candidates = iCandidateProvider;
        this.userwords = iCandidateProvider2;
        this.dialects = iCandidateProvider3;
        this.observers = new ArrayList<>();
    }

    public void registerCandidateListener(ICandidateListener iCandidateListener) {
        if (iCandidateListener != null && !this.observers.contains(iCandidateListener)) {
            this.observers.add(iCandidateListener);
            iCandidateListener.onCandidateUpdated(this.candidates.hasCandidates(), this.candidates, this.userwords.hasCandidates(), this.userwords, this.dialects.hasCandidates(), this.dialects, true);
        }
    }

    public void unregisterCandidateListener(ICandidateListener iCandidateListener) {
        if (this.observers.contains(iCandidateListener)) {
            this.observers.remove(iCandidateListener);
        }
    }

    public void removeAllCandidateListener() {
        this.observers.clear();
    }

    public void updateCandidate(int i, boolean z) {
        if (!Engine.isBusy()) {
            if (!this.updateEnabled) {
                this.hasDeferedUpdate = true;
            } else if (!Settings.getInstance().getBoolSetting(1) || !Engine.getInstance().isClickTransMode() || !Engine.getInstance().isMultitouch || Engine.getInstance().getWidgetManager().mo9646f().mo9200v() != 0) {
                this.candidates.reset();
                this.userwords.reset();
                this.dialects.reset();
                this.hasDeferedUpdate = false;
                boolean hasCandidates = this.candidates.hasCandidates();
                boolean hasCandidates2 = this.userwords.hasCandidates();
                boolean hasCandidates3 = this.dialects.hasCandidates();
                Iterator<ICandidateListener> it = this.observers.iterator();
                while (it.hasNext()) {
                    it.next().onCandidateUpdated(hasCandidates, this.candidates, hasCandidates2, this.userwords, hasCandidates3, this.dialects, z);
                }
            }
        }
    }

    public void updateCandidate(int i) {
        updateCandidate(i, true);
    }

    public void EnableUpdate(boolean z) {
        this.updateEnabled = z;
        if (this.updateEnabled && this.hasDeferedUpdate) {
            updateCandidate(0);
            Engine.getInstance().getWidgetManager().mo9651i().onOperationFinished();
        }
    }

    public static void updateUseSimpleCandidateFlag(String str, int i) {
        boolean z = true;
        if (!C1389aD.m6424E(str) || i == 1) {
            z = false;
        }
        simpleCandidate = z;
    }

    public static boolean useSimpleCandidateStyle() {
        return simpleCandidate && !HighFreqSettings.getInstance().forbidSimpleCandidateStyle;
    }
}
