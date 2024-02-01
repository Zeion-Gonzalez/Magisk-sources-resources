package p000a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.topjohnwu.magisk.R;

/* renamed from: a.UG */
/* loaded from: classes.dex */
public final class C1082UG implements InterfaceC2711zB {
    public static final Parcelable.Creator<C1082UG> CREATOR = new C2327rm(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000a.InterfaceC2711zB
    /* renamed from: v */
    public final void mo2260v() {
        AbstractC0795Op.m1871tJ(AbstractC1743gn.m3275z(), R.string.patch_file_msg, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p000a.InterfaceC1468bb
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public final void mo2259h(Uri uri) {
        C1650f1.f5113E.mo2290G(uri);
    }
}
