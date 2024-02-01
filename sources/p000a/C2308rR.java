package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: a.rR */
/* loaded from: classes.dex */
public final class C2308rR extends AbstractC2602x {
    public static final Parcelable.Creator<C2308rR> CREATOR = new C1260Xc(12);

    /* renamed from: I */
    public boolean f7125I;

    /* renamed from: w */
    public CharSequence f7126w;

    public C2308rR(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7126w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7125I = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7126w) + "}";
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        TextUtils.writeToParcel(this.f7126w, parcel, i);
        parcel.writeInt(this.f7125I ? 1 : 0);
    }
}
