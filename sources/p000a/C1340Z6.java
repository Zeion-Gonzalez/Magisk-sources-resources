package p000a;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: a.Z6 */
/* loaded from: classes.dex */
public final class C1340Z6 extends AbstractC2703z2 {

    /* renamed from: R */
    public final /* synthetic */ int f4234R;

    /* renamed from: w */
    public final /* synthetic */ Object f4235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1340Z6(int i, Object obj) {
        super(5);
        this.f4234R = i;
        this.f4235w = obj;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: G5 */
    public final void mo91G5(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.f4234R;
        Object obj = this.f4235w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Chip chip = (Chip) obj;
                C2694yr c2694yr = chip.f9330q;
                if (c2694yr.f8480hs) {
                    text = c2694yr.f8464T;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    C0131CY c0131cy = (C0131CY) obj;
                    c0131cy.f445N = true;
                    InterfaceC0879QU interfaceC0879QU = (InterfaceC0879QU) c0131cy.f447Q.get();
                    if (interfaceC0879QU != null) {
                        interfaceC0879QU.mo2027z();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Pm */
    public final void mo92Pm(int i) {
        switch (this.f4234R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return;
            default:
                C0131CY c0131cy = (C0131CY) this.f4235w;
                c0131cy.f445N = true;
                InterfaceC0879QU interfaceC0879QU = (InterfaceC0879QU) c0131cy.f447Q.get();
                if (interfaceC0879QU != null) {
                    interfaceC0879QU.mo2027z();
                    return;
                }
                return;
        }
    }
}
