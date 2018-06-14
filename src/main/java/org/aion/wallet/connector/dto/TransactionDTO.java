package org.aion.wallet.connector.dto;

import org.aion.base.util.TypeConverter;

import java.math.BigInteger;
import java.util.Objects;

public class TransactionDTO {
    private final String from;
    private final String to;
    private final String hash;
    private final BigInteger value;
    private final long nrg;
    private final long nrgPrice;
    private final long timeStamp;
    private final Long blockNumber;
    private final BigInteger nonce;

    public TransactionDTO(final String from, final String to, final String hash, final BigInteger value, final long nrg, final long nrgPrice, final long timeStamp, final long blockNumber, BigInteger nonce) {
        this.from = TypeConverter.toJsonHex(from);
        this.to = TypeConverter.toJsonHex(to);
        this.hash = hash;
        this.value = value;
        this.nrg = nrg;
        this.nrgPrice = nrgPrice;
        this.timeStamp = timeStamp;
        this.blockNumber = blockNumber;
        this.nonce = nonce;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getHash() {
        return hash;
    }

    public BigInteger getValue() {
        return value;
    }

    public Long getNrg() {
        return nrg;
    }

    public Long getNrgPrice() {
        return nrgPrice;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public Long getBlockNumber() {
        return blockNumber;
    }

    public BigInteger getNonce() {
        return nonce;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TransactionDTO that = (TransactionDTO) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(hash, that.hash) &&
                Objects.equals(value, that.value) &&
                Objects.equals(blockNumber, that.blockNumber) &&
                Objects.equals(nonce, that.nonce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, hash, value, blockNumber, nonce);
    }
}
