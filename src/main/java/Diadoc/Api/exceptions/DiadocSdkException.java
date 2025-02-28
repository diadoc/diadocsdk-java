package Diadoc.Api.exceptions;

import Diadoc.Api.helpers.System7Emu;
import org.jetbrains.annotations.Nullable;

public class DiadocSdkException extends Exception {
    @Nullable
    private final String traceId;
    public DiadocSdkException(Exception ex) {
        super(ex);
        this.traceId = extractTraceId(ex);
    }

    public DiadocSdkException(String message) {
        super(message);
        this.traceId = null;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }

    @Nullable
    private static String extractTraceId(Exception ex) {
        if (ex instanceof DiadocException) {
            return ((DiadocException) ex).getTraceId();
        }
        if (ex.getCause() instanceof KonturHttpException) {
            return ((KonturHttpException) ex.getCause()).getTraceId();
        }
        return null;
    }

    private String formatMessage(Throwable[] exceptions) {
        String text = super.toString();
        for (int i = 0; i < exceptions.length; i++){
            text = String.format("%s%s---> (Inner Exception #%s) %s%s%s", text, System7Emu.lineSeparator(), i, exceptions[i].toString(), "<---", System7Emu.lineSeparator());
        }
        return text;
    }
}
