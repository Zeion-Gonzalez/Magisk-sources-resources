package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: a.r3 */
/* loaded from: classes.dex */
public final class C2286r3 implements Parcelable {
    public static final Parcelable.Creator<C2286r3> CREATOR = new C2327rm(16);

    /* renamed from: I */
    public final int f7067I;

    /* renamed from: R */
    public final int f7068R;

    /* renamed from: S */
    public final int f7069S;

    /* renamed from: w */
    public final int f7070w;

    public C2286r3(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f7068R = readInt;
        this.f7070w = readInt2;
        this.f7067I = readInt3;
        this.f7069S = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2286r3)) {
            return false;
        }
        C2286r3 c2286r3 = (C2286r3) obj;
        return this.f7068R == c2286r3.f7068R && this.f7070w == c2286r3.f7070w && this.f7069S == c2286r3.f7069S && this.f7067I == c2286r3.f7067I;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7069S), Integer.valueOf(this.f7068R), Integer.valueOf(this.f7070w), Integer.valueOf(this.f7067I)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7068R);
        parcel.writeInt(this.f7070w);
        parcel.writeInt(this.f7067I);
        parcel.writeInt(this.f7069S);
    }
}
