package p000a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b0 */
/* loaded from: classes.dex */
public final class C1440b0 implements Parcelable {
    public static final Parcelable.Creator<C1440b0> CREATOR = new C2327rm(0);

    /* renamed from: R */
    public final Intent f4512R;

    /* renamed from: S */
    public final int f4513S;

    public C1440b0(Intent intent, int i) {
        this.f4513S = i;
        this.f4512R = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f4513S;
        if (i != -1) {
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f4512R);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4513S);
        Intent intent = this.f4512R;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C1440b0(Parcel parcel) {
        this.f4513S = parcel.readInt();
        this.f4512R = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
