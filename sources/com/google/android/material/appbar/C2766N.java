package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.appbar.N */
/* loaded from: classes.dex */
public final class C2766N implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C2768Q(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2768Q[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C2768Q(parcel, classLoader);
    }
}
