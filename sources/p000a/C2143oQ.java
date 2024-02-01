package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: a.oQ */
/* loaded from: classes.dex */
public final class C2143oQ implements InterfaceC0899Qx {
    public static final Parcelable.Creator<C2143oQ> CREATOR = new C2327rm(13);

    /* renamed from: S */
    public final long f6593S;

    public C2143oQ(long j) {
        this.f6593S = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2143oQ) && this.f6593S == ((C2143oQ) obj).f6593S;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6593S)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6593S);
    }
}
