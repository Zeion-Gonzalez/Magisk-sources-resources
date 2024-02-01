package com.topjohnwu.magisk.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.AbstractC2760z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000a.AbstractC1292YB;
import p000a.C2327rm;
import p000a.InterfaceC0467Ip;

@InterfaceC0467Ip(generateAdapter = AbstractC2760z.f8968H)
/* loaded from: classes.dex */
public final class MagiskJson implements Parcelable {
    public static final Parcelable.Creator<MagiskJson> CREATOR = new C2327rm(19);

    /* renamed from: I */
    public final String f9572I;

    /* renamed from: R */
    public final int f9573R;

    /* renamed from: S */
    public final String f9574S;

    /* renamed from: w */
    public final String f9575w;

    public MagiskJson(String str, int i, String str2, String str3) {
        this.f9574S = str;
        this.f9573R = i;
        this.f9575w = str2;
        this.f9572I = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagiskJson)) {
            return false;
        }
        MagiskJson magiskJson = (MagiskJson) obj;
        return AbstractC1292YB.m2695u(this.f9574S, magiskJson.f9574S) && this.f9573R == magiskJson.f9573R && AbstractC1292YB.m2695u(this.f9575w, magiskJson.f9575w) && AbstractC1292YB.m2695u(this.f9572I, magiskJson.f9572I);
    }

    public final int hashCode() {
        return this.f9572I.hashCode() + ((this.f9575w.hashCode() + (((this.f9574S.hashCode() * 31) + this.f9573R) * 31)) * 31);
    }

    public final String toString() {
        return "MagiskJson(version=" + this.f9574S + ", versionCode=" + this.f9573R + ", link=" + this.f9575w + ", note=" + this.f9572I + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9574S);
        parcel.writeInt(this.f9573R);
        parcel.writeString(this.f9575w);
        parcel.writeString(this.f9572I);
    }

    public /* synthetic */ MagiskJson(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
