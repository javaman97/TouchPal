package com.google.android.gms.plus;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.internal.C3712bt;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PlusClient implements GooglePlayServicesClient {
    @Deprecated
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";

    /* renamed from: hU */
    final C3712bt f16113hU;

    public static class Builder {

        /* renamed from: e */
        private GooglePlayServicesClient.OnConnectionFailedListener f16114e;

        /* renamed from: g */
        private String f16115g;

        /* renamed from: hV */
        private GooglePlayServicesClient.ConnectionCallbacks f16116hV;

        /* renamed from: hW */
        private ArrayList<String> f16117hW = new ArrayList<>();

        /* renamed from: hX */
        private String[] f16118hX;

        /* renamed from: hY */
        private String[] f16119hY;

        /* renamed from: hZ */
        private String f16120hZ = this.mContext.getPackageName();

        /* renamed from: ia */
        private String f16121ia = this.mContext.getPackageName();

        /* renamed from: ib */
        private String f16122ib;
        private Context mContext;

        public Builder(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.mContext = context;
            this.f16116hV = connectionCallbacks;
            this.f16114e = onConnectionFailedListener;
            this.f16117hW.add(Scopes.PLUS_LOGIN);
        }

        public PlusClient build() {
            if (this.f16115g == null) {
                this.f16115g = "<<default account>>";
            }
            return new PlusClient(new C3712bt(this.mContext, new C3932a(this.f16115g, (String[]) this.f16117hW.toArray(new String[this.f16117hW.size()]), this.f16118hX, this.f16119hY, this.f16120hZ, this.f16121ia, this.f16122ib), this.f16116hV, this.f16114e));
        }

        public Builder clearScopes() {
            this.f16117hW.clear();
            return this;
        }

        public Builder setAccountName(String str) {
            this.f16115g = str;
            return this;
        }

        public Builder setActions(String... strArr) {
            this.f16118hX = strArr;
            return this;
        }

        public Builder setScopes(String... strArr) {
            this.f16117hW.clear();
            this.f16117hW.addAll(Arrays.asList(strArr));
            return this;
        }

        @Deprecated
        public Builder setVisibleActivities(String... strArr) {
            setActions(strArr);
            return this;
        }
    }

    public interface OnAccessRevokedListener {
        void onAccessRevoked(ConnectionResult connectionResult);
    }

    public interface OnMomentsLoadedListener {
        void onMomentsLoaded(ConnectionResult connectionResult, MomentBuffer momentBuffer, String str, String str2);
    }

    public interface OnPeopleLoadedListener {
        void onPeopleLoaded(ConnectionResult connectionResult, PersonBuffer personBuffer, String str);
    }

    public interface OrderBy {
        public static final int ALPHABETICAL = 0;
        public static final int BEST = 1;
    }

    PlusClient(C3712bt btVar) {
        this.f16113hU = btVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bu */
    public C3712bt mo13235bu() {
        return this.f16113hU;
    }

    public void clearDefaultAccount() {
        this.f16113hU.clearDefaultAccount();
    }

    public void connect() {
        this.f16113hU.connect();
    }

    public void disconnect() {
        this.f16113hU.disconnect();
    }

    public String getAccountName() {
        return this.f16113hU.getAccountName();
    }

    public Person getCurrentPerson() {
        return this.f16113hU.getCurrentPerson();
    }

    public boolean isConnected() {
        return this.f16113hU.isConnected();
    }

    public boolean isConnecting() {
        return this.f16113hU.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f16113hU.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f16113hU.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void loadMoments(OnMomentsLoadedListener onMomentsLoadedListener) {
        this.f16113hU.loadMoments(onMomentsLoadedListener);
    }

    public void loadMoments(OnMomentsLoadedListener onMomentsLoadedListener, int i, String str, Uri uri, String str2, String str3) {
        this.f16113hU.loadMoments(onMomentsLoadedListener, i, str, uri, str2, str3);
    }

    public void loadPeople(OnPeopleLoadedListener onPeopleLoadedListener, Collection<String> collection) {
        this.f16113hU.mo11843a(onPeopleLoadedListener, collection);
    }

    public void loadPeople(OnPeopleLoadedListener onPeopleLoadedListener, String... strArr) {
        this.f16113hU.mo11844a(onPeopleLoadedListener, strArr);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onPeopleLoadedListener, int i, String str) {
        this.f16113hU.loadVisiblePeople(onPeopleLoadedListener, i, str);
    }

    public void loadVisiblePeople(OnPeopleLoadedListener onPeopleLoadedListener, String str) {
        this.f16113hU.loadVisiblePeople(onPeopleLoadedListener, str);
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f16113hU.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f16113hU.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void removeMoment(String str) {
        this.f16113hU.removeMoment(str);
    }

    public void revokeAccessAndDisconnect(OnAccessRevokedListener onAccessRevokedListener) {
        this.f16113hU.revokeAccessAndDisconnect(onAccessRevokedListener);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f16113hU.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f16113hU.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public void writeMoment(Moment moment) {
        this.f16113hU.writeMoment(moment);
    }
}
