package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: a.Bv */
/* loaded from: classes.dex */
public final class C0098Bv implements Parcelable {
    public static final Parcelable.Creator<C0098Bv> CREATOR = new C2327rm(8);

    /* renamed from: I */
    public int[] f359I;

    /* renamed from: R */
    public int f360R;

    /* renamed from: S */
    public int f361S;

    /* renamed from: U */
    public boolean f362U;

    /* renamed from: g */
    public List f363g;

    /* renamed from: k */
    public int[] f364k;

    /* renamed from: q */
    public int f365q;

    /* renamed from: s */
    public boolean f366s;

    /* renamed from: w */
    public int f367w;

    /* renamed from: y */
    public boolean f368y;

    public C0098Bv(C0098Bv c0098Bv) {
        this.f367w = c0098Bv.f367w;
        this.f361S = c0098Bv.f361S;
        this.f360R = c0098Bv.f360R;
        this.f359I = c0098Bv.f359I;
        this.f365q = c0098Bv.f365q;
        this.f364k = c0098Bv.f364k;
        this.f368y = c0098Bv.f368y;
        this.f366s = c0098Bv.f366s;
        this.f362U = c0098Bv.f362U;
        this.f363g = c0098Bv.f363g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f361S);
        parcel.writeInt(this.f360R);
        parcel.writeInt(this.f367w);
        if (this.f367w > 0) {
            parcel.writeIntArray(this.f359I);
        }
        parcel.writeInt(this.f365q);
        if (this.f365q > 0) {
            parcel.writeIntArray(this.f364k);
        }
        parcel.writeInt(this.f368y ? 1 : 0);
        parcel.writeInt(this.f366s ? 1 : 0);
        parcel.writeInt(this.f362U ? 1 : 0);
        parcel.writeList(this.f363g);
    }

    public C0098Bv(Parcel parcel) {
        this.f361S = parcel.readInt();
        this.f360R = parcel.readInt();
        int readInt = parcel.readInt();
        this.f367w = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f359I = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.f365q = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f364k = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f368y = parcel.readInt() == 1;
        this.f366s = parcel.readInt() == 1;
        this.f362U = parcel.readInt() == 1;
        this.f363g = parcel.readArrayList(C2690ym.class.getClassLoader());
    }
}
