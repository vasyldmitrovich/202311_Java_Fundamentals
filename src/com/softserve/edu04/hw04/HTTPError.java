package com.softserve.edu04.hw04;

import java.util.Scanner;

public class HTTPError {
    static Scanner scanner = new Scanner(System.in);
    public enum HTTP {
        BadRequest(400),//better to use here 400("Bad Request") and the same for other codes
        Unauthorized(401),
        PaymentRequired(402),
        Forbidden(403),
        NotFound(404),
        MethodNotAllowed(405),
        NotAcceptable(406),
        ProxyAuthenticationRequired(407),
        RequestTimeout(408),
        Conflict(409),
        Gone(410),
        LengthRequired(411),
        PreconditionFailed(412),
        RequestEntityTooLarge(413),
        RequestURITooLong(414),
        UnsupportedMediaType(415),
        RequestedRangeNotSatisfiable(416),
        ExpectationFailed(417);


        private HTTP(int code) {
        }

        @Override
        public String toString() {
            return " " + super.toString();
        }
    }

    public void detectionError() {
        System.out.print(" Enter code of error: ");
        int code = scanner.nextInt();
        switch ((code)) {
            case 400:
                System.out.println(HTTP.BadRequest);
                break;
            case 401:
                System.out.println(HTTP.Unauthorized);
                break;
            case 402:
                System.out.println(HTTP.PaymentRequired);
                break;
            case 403:
                System.out.println(HTTP.Forbidden);
                break;
            case 404:
                System.out.println(HTTP.NotFound);
                break;
            case 405:
                System.out.println(HTTP.MethodNotAllowed);
                break;
            case 406:
                System.out.println(HTTP.NotAcceptable);
                break;
            case 407:
                System.out.println(HTTP.ProxyAuthenticationRequired);
                break;
            case 408:
                System.out.println(HTTP.RequestTimeout);
                break;
            case 409:
                System.out.println(HTTP.Conflict);
                break;
            case 410:
                System.out.println(HTTP.Gone);
                break;
            case 411:
                System.out.println(HTTP.LengthRequired);
                break;
            case 412:
                System.out.println(HTTP.PreconditionFailed);
                break;
            case 413:
                System.out.println(HTTP.RequestEntityTooLarge);
                break;
            case 414:
                System.out.println(HTTP.RequestURITooLong);
                break;
            case 415:
                System.out.println(HTTP.UnsupportedMediaType);
                break;
            case 416:
                System.out.println(HTTP.RequestedRangeNotSatisfiable);
                break;
            case 417:
                System.out.println(HTTP.ExpectationFailed);
                break;
            default:
                System.out.println(" Unknown error");
                break;
        }
    }
}
