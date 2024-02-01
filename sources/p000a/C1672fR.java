package p000a;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.fR */
/* loaded from: classes.dex */
public class C1672fR extends EditText implements InterfaceC2138oK, InterfaceC1984lJ {

    /* renamed from: I */
    public final C2344s5 f5229I;

    /* renamed from: R */
    public final C1791hh f5230R;

    /* renamed from: S */
    public final C2226py f5231S;

    /* renamed from: k */
    public C0035Aj f5232k;

    /* renamed from: q */
    public final C1624eZ f5233q;

    /* renamed from: w */
    public final C1624eZ f5234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672fR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1365ZY.m2763z(context);
        AbstractC1757h0.m3289z(this, getContext());
        C2226py c2226py = new C2226py(this);
        this.f5231S = c2226py;
        c2226py.m3864N(attributeSet, R.attr.editTextStyle);
        C1791hh c1791hh = new C1791hh(this);
        this.f5230R = c1791hh;
        c1791hh.m3336P(attributeSet, R.attr.editTextStyle);
        c1791hh.m3339h();
        this.f5234w = new C1624eZ(this, 2);
        this.f5229I = new C2344s5();
        C1624eZ c1624eZ = new C1624eZ((EditText) this);
        this.f5233q = c1624eZ;
        c1624eZ.m3085o(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if ((!(keyListener instanceof NumberKeyListener)) != false) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m3086v = c1624eZ.m3086v(keyListener);
            if (m3086v != keyListener) {
                super.setKeyListener(m3086v);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f5230R;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f5230R;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f5231S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f5230R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1843ih.m3461tJ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        C1624eZ c1624eZ;
        if (Build.VERSION.SDK_INT < 28 && (c1624eZ = this.f5234w) != null) {
            TextClassifier textClassifier = (TextClassifier) c1624eZ.f5015w;
            if (textClassifier == null) {
                return AbstractC0214E4.m419z((TextView) c1624eZ.f5013R);
            }
            return textClassifier;
        }
        if (this.f5232k == null) {
            this.f5232k = new C0035Aj(this, 1);
        }
        C0035Aj c0035Aj = this.f5232k;
        int i = c0035Aj.f176S;
        View view = c0035Aj.f175R;
        switch (i) {
            case 1:
                return super.getTextClassifier();
            default:
                return super.getTextClassifier();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x006a, code lost:
    
        if (r1 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0055, code lost:
    
        if (r1 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0057, code lost:
    
        r6 = r1;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            a.hh r1 = r7.f5230R
            r1.getClass()
            p000a.C1791hh.m3331Q(r7, r0, r8)
            p000a.AbstractC2575wW.m4443nP(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = p000a.AbstractC2446u3.m4218Q(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            p000a.AbstractC0685My.m1597q(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            a.AR r2 = new a.AR
            r6 = 0
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            a.Zx r1 = new a.Zx
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = p000a.AbstractC0795Op.f2702N
            if (r1 < r5) goto L59
            java.lang.String[] r1 = p000a.AbstractC0685My.m1595k(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            a.g3 r1 = new a.g3
            r1.<init>(r0, r2)
            goto L4b
        L77:
            a.eZ r1 = r7.f5233q
            android.view.inputmethod.InputConnection r8 = r1.m3083V(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1672fR.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC2446u3.m4218Q(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = AbstractC2209pc.m3850z(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 31 && AbstractC2446u3.m4218Q(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C2196pM c2196pM = new C2196pM(primaryClip, 1);
                if (i != 16908322) {
                    i2 = 1;
                }
                ((InterfaceC1792hi) c2196pM.f6755R).mo3072o(i2);
                AbstractC2446u3.m4224o(this, ((InterfaceC1792hi) c2196pM.f6755R).mo3071h());
            }
            i2 = 1;
        }
        if (i2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f5231S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f5231S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f5230R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f5230R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1843ih.m3423Rh(callback, this));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5233q.m3086v(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1791hh c1791hh = this.f5230R;
        if (c1791hh != null) {
            c1791hh.m3335N(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        C1624eZ c1624eZ;
        if (Build.VERSION.SDK_INT < 28 && (c1624eZ = this.f5234w) != null) {
            c1624eZ.f5015w = textClassifier;
            return;
        }
        if (this.f5232k == null) {
            this.f5232k = new C0035Aj(this, 1);
        }
        C0035Aj c0035Aj = this.f5232k;
        int i = c0035Aj.f176S;
        View view = c0035Aj.f175R;
        switch (i) {
            case 1:
                super.setTextClassifier(textClassifier);
                return;
            default:
                super.setTextClassifier(textClassifier);
                return;
        }
    }

    @Override // p000a.InterfaceC2138oK
    /* renamed from: z */
    public final C0671Mh mo3169z(C0671Mh c0671Mh) {
        return this.f5229I.m4020z(this, c0671Mh);
    }
}
