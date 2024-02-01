package p000a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;

/* renamed from: a.Jv */
/* loaded from: classes.dex */
public final class C0526Jv extends URLSpan {

    /* renamed from: R */
    public final String f1768R;

    /* renamed from: S */
    public final C0846Po f1769S;

    /* renamed from: w */
    public final C0054B3 f1770w;

    public C0526Jv(C0846Po c0846Po, String str, C0054B3 c0054b3) {
        super(str);
        this.f1769S = c0846Po;
        this.f1768R = str;
        this.f1770w = c0054b3;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f1770w.getClass();
        String str = this.f1768R;
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = parse.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f1769S.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
