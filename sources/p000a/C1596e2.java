package p000a;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: a.e2 */
/* loaded from: classes.dex */
public final class C1596e2 implements InterfaceC1792hi, InterfaceC0460Ii {

    /* renamed from: I */
    public int f4900I;

    /* renamed from: R */
    public final Object f4901R;

    /* renamed from: S */
    public final /* synthetic */ int f4902S = 1;

    /* renamed from: k */
    public Object f4903k;

    /* renamed from: q */
    public Object f4904q;

    /* renamed from: w */
    public int f4905w;

    public C1596e2(C1596e2 c1596e2) {
        ClipData clipData = (ClipData) c1596e2.f4901R;
        clipData.getClass();
        this.f4901R = clipData;
        int i = c1596e2.f4905w;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i > 5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
        this.f4905w = i;
        int i2 = c1596e2.f4900I;
        if ((i2 & 1) == i2) {
            this.f4900I = i2;
            this.f4904q = (Uri) c1596e2.f4904q;
            this.f4903k = (Bundle) c1596e2.f4903k;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: N */
    public final void mo3070N(Uri uri) {
        this.f4904q = uri;
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: P */
    public final int mo1116P() {
        return this.f4900I;
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: Q */
    public final ContentInfo mo1117Q() {
        return null;
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: h */
    public final C0671Mh mo3071h() {
        return new C0671Mh(new C1596e2(this));
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: o */
    public final void mo3072o(int i) {
        this.f4900I = i;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f4902S) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f4901R).getDescription());
                sb.append(", source=");
                int i = this.f4905w;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.f4900I;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (((Uri) this.f4904q) == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + ((Uri) this.f4904q).toString().length() + ")";
                }
                sb.append(str2);
                if (((Bundle) this.f4903k) != null) {
                    str3 = ", hasExtras";
                }
                return AbstractC2441tz.m4187M(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: u */
    public final int mo1118u() {
        return this.f4905w;
    }

    @Override // p000a.InterfaceC1792hi
    /* renamed from: v */
    public final void mo3073v(Bundle bundle) {
        this.f4903k = bundle;
    }

    @Override // p000a.InterfaceC0460Ii
    /* renamed from: z */
    public final ClipData mo1119z() {
        return (ClipData) this.f4901R;
    }

    public C1596e2(ClipData clipData, int i) {
        this.f4901R = clipData;
        this.f4905w = i;
    }
}
