package p000a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.Gs */
/* loaded from: classes.dex */
public final class C0359Gs implements Parcelable {
    public static final Parcelable.Creator<C0359Gs> CREATOR = new C2327rm(5);

    /* renamed from: I */
    public final Bundle f1209I;

    /* renamed from: R */
    public final int f1210R;

    /* renamed from: S */
    public final String f1211S;

    /* renamed from: w */
    public final Bundle f1212w;

    public C0359Gs(C1553dE c1553dE) {
        this.f1211S = c1553dE.f4794k;
        this.f1210R = c1553dE.f4790R.f4455y;
        this.f1212w = c1553dE.m3023v();
        Bundle bundle = new Bundle();
        this.f1209I = bundle;
        c1553dE.f4796s.m2712v(bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final C1553dE m782h(Context context, C1420ag c1420ag, EnumC1632eh enumC1632eh, C0401Hd c0401Hd) {
        Bundle bundle = this.f1212w;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        int i = C1553dE.f4787f;
        return new C1553dE(context, c1420ag, bundle2, enumC1632eh, c0401Hd, this.f1211S, this.f1209I);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1211S);
        parcel.writeInt(this.f1210R);
        parcel.writeBundle(this.f1212w);
        parcel.writeBundle(this.f1209I);
    }

    public C0359Gs(Parcel parcel) {
        this.f1211S = parcel.readString();
        this.f1210R = parcel.readInt();
        this.f1212w = parcel.readBundle(C0359Gs.class.getClassLoader());
        this.f1209I = parcel.readBundle(C0359Gs.class.getClassLoader());
    }
}
