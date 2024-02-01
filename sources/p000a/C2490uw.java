package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: a.uw */
/* loaded from: classes.dex */
public final class C2490uw extends AbstractC2602x {
    public static final Parcelable.Creator<C2490uw> CREATOR = new C1260Xc(2);

    /* renamed from: w */
    public SparseArray f7624w;

    public C2490uw(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f7624w = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f7624w.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeParcelable(this.f8021S, i);
        SparseArray sparseArray = this.f7624w;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.f7624w.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f7624w.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
