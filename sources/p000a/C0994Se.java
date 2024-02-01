package p000a;

import java.util.regex.Pattern;

/* renamed from: a.Se */
/* loaded from: classes.dex */
public final class C0994Se extends AbstractC2392t {

    /* renamed from: N */
    public static final Pattern[][] f3336N = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: h */
    public final Pattern f3338h;

    /* renamed from: z */
    public final C0794Oo f3340z = new C0794Oo();

    /* renamed from: v */
    public boolean f3339v = false;

    /* renamed from: P */
    public C0073BQ f3337P = new C0073BQ(7);

    public C0994Se(Pattern pattern) {
        this.f3338h = pattern;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        return this.f3340z;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        if (this.f3339v) {
            return null;
        }
        C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
        if (c1858j0.f5807o && this.f3338h == null) {
            return null;
        }
        return C1253XQ.m2558z(c1858j0.f5806h);
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: v */
    public final void mo42v() {
        ((StringBuilder) this.f3337P.f309R).toString();
        this.f3340z.getClass();
        this.f3337P = null;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: z */
    public final void mo43z(CharSequence charSequence) {
        C0073BQ c0073bq = this.f3337P;
        int i = c0073bq.f310S;
        Object obj = c0073bq.f309R;
        if (i != 0) {
            ((StringBuilder) obj).append('\n');
        }
        ((StringBuilder) obj).append(charSequence);
        c0073bq.f310S++;
        Pattern pattern = this.f3338h;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f3339v = true;
        }
    }
}
