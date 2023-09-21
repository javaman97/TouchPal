package com.google.android.gms.internal;

import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3737cc;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.cn */
public final class C3758cn extends C3523b implements Person {
    public C3758cn(C3525d dVar, int i) {
        super(dVar, i);
    }

    /* renamed from: cA */
    public Person freeze() {
        return new C3737cc(getDisplayName(), getId(), (C3737cc.C3742c) getImage(), getObjectType(), getUrl());
    }

    /* renamed from: cw */
    public ArrayList<Person.Emails> getEmails() {
        return null;
    }

    /* renamed from: cx */
    public ArrayList<Person.Organizations> getOrganizations() {
        return null;
    }

    /* renamed from: cy */
    public ArrayList<Person.PlacesLived> getPlacesLived() {
        return null;
    }

    /* renamed from: cz */
    public ArrayList<Person.Urls> getUrls() {
        return null;
    }

    public String getAboutMe() {
        return null;
    }

    public Person.AgeRange getAgeRange() {
        return null;
    }

    public String getBirthday() {
        return null;
    }

    public String getBraggingRights() {
        return null;
    }

    public int getCircledByCount() {
        return 0;
    }

    public Person.Cover getCover() {
        return null;
    }

    public String getCurrentLocation() {
        return null;
    }

    public String getDisplayName() {
        return getString("displayName");
    }

    public int getGender() {
        return 0;
    }

    public String getId() {
        return getString("personId");
    }

    public Person.Image getImage() {
        return new C3737cc.C3742c(getString("image"));
    }

    public String getLanguage() {
        return null;
    }

    public Person.Name getName() {
        return null;
    }

    public String getNickname() {
        return null;
    }

    public int getObjectType() {
        return C3737cc.C3744e.m16455G(getString("objectType"));
    }

    public int getPlusOneCount() {
        return 0;
    }

    public int getRelationshipStatus() {
        return 0;
    }

    public String getTagline() {
        return null;
    }

    public String getUrl() {
        return getString("url");
    }

    public boolean hasAboutMe() {
        return false;
    }

    public boolean hasAgeRange() {
        return false;
    }

    public boolean hasBirthday() {
        return false;
    }

    public boolean hasBraggingRights() {
        return false;
    }

    public boolean hasCircledByCount() {
        return false;
    }

    public boolean hasCover() {
        return false;
    }

    public boolean hasCurrentLocation() {
        return false;
    }

    public boolean hasDisplayName() {
        return true;
    }

    public boolean hasEmails() {
        return false;
    }

    public boolean hasGender() {
        return false;
    }

    public boolean hasId() {
        return true;
    }

    public boolean hasImage() {
        return true;
    }

    public boolean hasIsPlusUser() {
        return false;
    }

    public boolean hasLanguage() {
        return false;
    }

    public boolean hasName() {
        return false;
    }

    public boolean hasNickname() {
        return false;
    }

    public boolean hasObjectType() {
        return true;
    }

    public boolean hasOrganizations() {
        return false;
    }

    public boolean hasPlacesLived() {
        return false;
    }

    public boolean hasPlusOneCount() {
        return false;
    }

    public boolean hasRelationshipStatus() {
        return false;
    }

    public boolean hasTagline() {
        return false;
    }

    public boolean hasUrl() {
        return true;
    }

    public boolean hasUrls() {
        return false;
    }

    public boolean hasVerified() {
        return false;
    }

    public boolean isPlusUser() {
        return false;
    }

    public boolean isVerified() {
        return false;
    }
}
