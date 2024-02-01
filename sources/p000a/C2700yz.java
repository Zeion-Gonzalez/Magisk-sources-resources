package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.yz */
/* loaded from: classes.dex */
public final class C2700yz extends AbstractC2602x {
    public static final Parcelable.Creator<C2700yz> CREATOR = new C1260Xc(4);

    /* renamed from: w */
    public Parcelable f8518w;

    public C2700yz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8518w = parcel.readParcelable(classLoader == null ? AbstractC0667Md.class.getClassLoader() : classLoader);
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeParcelable(this.f8518w, 0);
    }
}
