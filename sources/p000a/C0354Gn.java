package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: a.Gn */
/* loaded from: classes.dex */
public final class C0354Gn implements Parcelable {
    public static final Parcelable.Creator<C0354Gn> CREATOR = new C0773OP(3);

    /* renamed from: I */
    public int f1191I;

    /* renamed from: R */
    public ArrayList f1192R;

    /* renamed from: S */
    public ArrayList f1193S;

    /* renamed from: g */
    public final ArrayList f1194g;

    /* renamed from: k */
    public final ArrayList f1195k;

    /* renamed from: q */
    public String f1196q;

    /* renamed from: w */
    public C0682Mu[] f1197w;

    /* renamed from: y */
    public ArrayList f1198y;

    public C0354Gn() {
        this.f1196q = null;
        this.f1195k = new ArrayList();
        this.f1194g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1193S);
        parcel.writeStringList(this.f1192R);
        parcel.writeTypedArray(this.f1197w, i);
        parcel.writeInt(this.f1191I);
        parcel.writeString(this.f1196q);
        parcel.writeStringList(this.f1195k);
        parcel.writeTypedList(this.f1194g);
        parcel.writeTypedList(this.f1198y);
    }

    public C0354Gn(Parcel parcel) {
        this.f1196q = null;
        this.f1195k = new ArrayList();
        this.f1194g = new ArrayList();
        this.f1193S = parcel.createStringArrayList();
        this.f1192R = parcel.createStringArrayList();
        this.f1197w = (C0682Mu[]) parcel.createTypedArray(C0682Mu.CREATOR);
        this.f1191I = parcel.readInt();
        this.f1196q = parcel.readString();
        this.f1195k = parcel.createStringArrayList();
        this.f1194g = parcel.createTypedArrayList(C0885Qd.CREATOR);
        this.f1198y = parcel.createTypedArrayList(C2730zX.CREATOR);
    }
}
