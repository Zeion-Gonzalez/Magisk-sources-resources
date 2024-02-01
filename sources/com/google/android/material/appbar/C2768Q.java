package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.AbstractC2602x;

/* renamed from: com.google.android.material.appbar.Q */
/* loaded from: classes.dex */
public final class C2768Q extends AbstractC2602x {
    public static final Parcelable.Creator<C2768Q> CREATOR = new C2766N();

    /* renamed from: I */
    public boolean f9195I;

    /* renamed from: g */
    public boolean f9196g;

    /* renamed from: k */
    public float f9197k;

    /* renamed from: q */
    public int f9198q;

    /* renamed from: w */
    public boolean f9199w;

    public C2768Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9199w = parcel.readByte() != 0;
        this.f9195I = parcel.readByte() != 0;
        this.f9198q = parcel.readInt();
        this.f9197k = parcel.readFloat();
        this.f9196g = parcel.readByte() != 0;
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeByte(this.f9199w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9195I ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f9198q);
        parcel.writeFloat(this.f9197k);
        parcel.writeByte(this.f9196g ? (byte) 1 : (byte) 0);
    }
}
