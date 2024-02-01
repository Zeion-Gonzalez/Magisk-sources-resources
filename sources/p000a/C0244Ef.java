package p000a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.Ef */
/* loaded from: classes.dex */
public final class C0244Ef implements Parcelable {
    public static final Parcelable.Creator<C0244Ef> CREATOR = new C2327rm(1);

    /* renamed from: I */
    public final int f833I;

    /* renamed from: R */
    public final Intent f834R;

    /* renamed from: S */
    public final IntentSender f835S;

    /* renamed from: w */
    public final int f836w;

    public C0244Ef(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f835S = intentSender;
        this.f834R = intent;
        this.f836w = i;
        this.f833I = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f835S, i);
        parcel.writeParcelable(this.f834R, i);
        parcel.writeInt(this.f836w);
        parcel.writeInt(this.f833I);
    }
}
