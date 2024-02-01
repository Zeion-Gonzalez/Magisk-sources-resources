package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.Qd */
/* loaded from: classes.dex */
public final class C0885Qd implements Parcelable {
    public static final Parcelable.Creator<C0885Qd> CREATOR = new C0773OP(1);

    /* renamed from: R */
    public final List f3048R;

    /* renamed from: S */
    public final List f3049S;

    public C0885Qd(Parcel parcel) {
        this.f3049S = parcel.createStringArrayList();
        this.f3048R = parcel.createTypedArrayList(C0682Mu.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3049S);
        parcel.writeTypedList(this.f3048R);
    }

    public C0885Qd(ArrayList arrayList, ArrayList arrayList2) {
        this.f3049S = arrayList;
        this.f3048R = arrayList2;
    }
}
