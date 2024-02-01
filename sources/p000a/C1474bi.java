package p000a;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: a.bi */
/* loaded from: classes.dex */
public final class C1474bi {

    /* renamed from: M */
    public boolean f4576M;

    /* renamed from: P */
    public int f4578P;

    /* renamed from: h */
    public final TextPaint f4582h;

    /* renamed from: v */
    public final int f4585v;

    /* renamed from: z */
    public CharSequence f4586z;

    /* renamed from: N */
    public Layout.Alignment f4577N = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: Q */
    public int f4579Q = Integer.MAX_VALUE;

    /* renamed from: u */
    public float f4584u = 0.0f;

    /* renamed from: o */
    public float f4583o = 1.0f;

    /* renamed from: W */
    public int f4581W = 1;

    /* renamed from: G */
    public boolean f4575G = true;

    /* renamed from: V */
    public TextUtils.TruncateAt f4580V = null;

    public C1474bi(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4586z = charSequence;
        this.f4582h = textPaint;
        this.f4585v = i;
        this.f4578P = charSequence.length();
    }

    /* renamed from: z */
    public final StaticLayout m2885z() {
        if (this.f4586z == null) {
            this.f4586z = "";
        }
        int max = Math.max(0, this.f4585v);
        CharSequence charSequence = this.f4586z;
        int i = this.f4579Q;
        TextPaint textPaint = this.f4582h;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f4580V);
        }
        int min = Math.min(charSequence.length(), this.f4578P);
        this.f4578P = min;
        if (this.f4576M && this.f4579Q == 1) {
            this.f4577N = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f4577N);
        obtain.setIncludePad(this.f4575G);
        obtain.setTextDirection(this.f4576M ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f4580V;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f4579Q);
        float f = this.f4584u;
        if (f != 0.0f || this.f4583o != 1.0f) {
            obtain.setLineSpacing(f, this.f4583o);
        }
        if (this.f4579Q > 1) {
            obtain.setHyphenationFrequency(this.f4581W);
        }
        return obtain.build();
    }
}
