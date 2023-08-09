// (5 + 6 i) + (1+5i) = 6 + 11i

class Complex {
    double re,im;

    double abs() {
        return Math.sqrt(re*re + im*im);
    }

    void add(Complex that) {
        re += that.re;
        im += that.im;
    }

    void sub(Complex that) {
        re -= that.re;
        im -= that.im;
    }

    void mul(Complex that) {
        double new_re = re*that.re - im*that.im;
        double new_im = re*that.im + im*that.re;
        re = new_re;
        im = new_im;
    }

}