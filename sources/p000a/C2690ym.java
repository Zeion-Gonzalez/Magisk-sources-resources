package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: a.ym */
/* loaded from: classes.dex */
public final class C2690ym implements Parcelable {
    public static final Parcelable.Creator<C2690ym> CREATOR = new C2327rm(7);

    /* renamed from: I */
    public boolean f8382I;

    /* renamed from: R */
    public int f8383R;

    /* renamed from: S */
    public int f8384S;

    /* renamed from: w */
    public int[] f8385w;

    public C2690ym(Parcel parcel) {
        this.f8384S = parcel.readInt();
        this.f8383R = parcel.readInt();
        this.f8382I = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f8385w = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f8384S + ", mGapDir=" + this.f8383R + ", mHasUnwantedGapAfter=" + this.f8382I + ", mGapPerSpan=" + Arrays.toString(this.f8385w) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8384S);
        parcel.writeInt(this.f8383R);
        parcel.writeInt(this.f8382I ? 1 : 0);
        int[] iArr = this.f8385w;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f8385w);
        }
    }
}
