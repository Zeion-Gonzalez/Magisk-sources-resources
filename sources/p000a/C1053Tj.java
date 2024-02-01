package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: a.Tj */
/* loaded from: classes.dex */
public final class C1053Tj extends View.BaseSavedState {
    public static final Parcelable.Creator<C1053Tj> CREATOR = new C2327rm(11);

    /* renamed from: S */
    public int f3477S;

    public C1053Tj(Parcel parcel) {
        super(parcel);
        this.f3477S = ((Integer) parcel.readValue(C1053Tj.class.getClassLoader())).intValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f3477S;
        if (i != 1) {
            if (i != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return AbstractC2441tz.m4187M(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f3477S));
    }
}
