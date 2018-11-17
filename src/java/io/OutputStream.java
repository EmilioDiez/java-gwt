package java.io;

/**
 * OutputStream is an abstract class for all byte output streams. It provides
 * basic method implementations for writing bytes to a stream.
 *
 * @see InputStream
 */

public abstract class OutputStream implements Closeable,Flushable{
        /**
         * This constructor does nothing interesting. Provided for signature
         * compatibility.
         *
         */

        public OutputStream() {
                /*empty*/
        }

        /**
         * Close this OutputStream. Concrete implementations of this class should
         * free any resources during close. This implementation does nothing.
         *
         * @throws IOException
         *             If an error occurs attempting to close this OutputStream.
         */
        public void close() throws IOException {
                /*empty*/
        }

        /**
         * Flush this OutputStream. Concrete implementations of this class should
         * ensure any pending writes to the underlying stream are written out when
         * this method is envoked. This implementation does nothing.
         *
         * @throws IOException
         *             If an error occurs attempting to flush this OutputStream.
         */

        public void flush() throws IOException {
                /*empty */
        }

        /**
         * Writes the entire contents of the byte array <code>buffer</code> to
         * this OutputStream.
         *
         * @param buffer
         *            the buffer to be written
         *
         * @throws IOException
         *             If an error occurs attempting to write to this OutputStream.
         */

        public void write(byte buffer[]) throws IOException {
                write(buffer, 0, buffer.length);
        }

        /**
         * Writes <code>count</code> <code>bytes</code> from the byte array
         * <code>buffer</code> starting at <code>offset</code> to this
         * OutputStream.
         *
         * @param buffer
         *            the buffer to be written
         * @param offset
         *            offset in buffer to get bytes
         * @param count
         *            number of bytes in buffer to write
         *
         * @throws IndexOutOfBoundsException
         *             If offset or count are outside of bounds.
         */
        public void write(byte buffer[], int offset, int count) throws IOException {
                // avoid int overflow, check null buffer
                if (offset <= buffer.length && 0 <= offset && 0 <= count
                                && count <= buffer.length - offset) {
                        for (int i = offset; i < offset + count; i++)
                                write(buffer[i]);
                } else {
                        throw new IndexOutOfBoundsException(); //$NON-NLS-1$
                }
        }

        /**
         * Writes the specified byte <code>oneByte</code> to this OutputStream.
         * Only the low order byte of <code>oneByte</code> is written.
         *
         * @param oneByte
         *            the byte to be written
         *
         * @throws IOException
         *             If an error occurs attempting to write to this OutputStream.
         */

        public abstract void write(int oneByte) throws IOException;
}
