package p000a;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: a.bS */
/* loaded from: classes.dex */
public final class C1461bS extends C1665fK {

    /* renamed from: I */
    public boolean f4550I;

    /* renamed from: R */
    public final TextView f4551R;

    /* renamed from: w */
    public final C2156of f4552w;

    public C1461bS(TextView textView) {
        super(19);
        this.f4551R = textView;
        this.f4550I = true;
        this.f4552w = new C2156of(textView);
    }

    @Override // p000a.C1665fK
    /* renamed from: S */
    public final InputFilter[] mo2032S(InputFilter[] inputFilterArr) {
        if (!this.f4550I) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2156of) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C2156of c2156of = this.f4552w;
            if (i4 < length2) {
                if (inputFilterArr[i4] != c2156of) {
                    i4++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c2156of;
                return inputFilterArr3;
            }
        }
    }

    @Override // p000a.C1665fK
    /* renamed from: c */
    public final TransformationMethod mo2033c(TransformationMethod transformationMethod) {
        if (this.f4550I) {
            if (!(transformationMethod instanceof C1646ey) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C1646ey(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof C1646ey) {
            return ((C1646ey) transformationMethod).f5106z;
        }
        return transformationMethod;
    }

    @Override // p000a.C1665fK
    /* renamed from: f */
    public final void mo2034f(boolean z) {
        this.f4550I = z;
        TextView textView = this.f4551R;
        textView.setTransformationMethod(mo2033c(textView.getTransformationMethod()));
        textView.setFilters(mo2032S(textView.getFilters()));
    }

    @Override // p000a.C1665fK
    /* renamed from: k */
    public final boolean mo2035k() {
        return this.f4550I;
    }

    @Override // p000a.C1665fK
    /* renamed from: s */
    public final void mo2036s(boolean z) {
        if (z) {
            TextView textView = this.f4551R;
            textView.setTransformationMethod(mo2033c(textView.getTransformationMethod()));
        }
    }
}
