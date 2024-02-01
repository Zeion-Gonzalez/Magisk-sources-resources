package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: a.Mn */
/* loaded from: classes.dex */
public final class C0676Mn implements Parcelable {

    /* renamed from: R */
    public static final ClassLoader f2227R = C0676Mn.class.getClassLoader();

    /* renamed from: w */
    public static final C2327rm f2228w = new C2327rm(25);

    /* renamed from: S */
    public final Object f2229S;

    public C0676Mn() {
        this.f2229S = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final void m1573h() {
        Object obj = this.f2229S;
        if (obj instanceof Throwable) {
            throw new IOException("Exception thrown on remote process", (Throwable) obj);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f2229S);
    }

    public C0676Mn(Parcel parcel) {
        this.f2229S = parcel.readValue(f2227R);
    }

    public C0676Mn(Serializable serializable) {
        this.f2229S = serializable;
    }
}
