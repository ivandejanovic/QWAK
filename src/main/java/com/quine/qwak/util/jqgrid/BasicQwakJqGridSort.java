/**
 * The MIT License (MIT)
 *
 * Copyright 2008-2016 Ivan Dejanovic and Quine Interactive
 * www.quineinteractive.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package com.quine.qwak.util.jqgrid;

/**
 * Convenience class that implements all the functionality of the QwakJqGridSort interface.
 * 
 * @author Ivan Dejanovic
 * 
 * @version 1.0
 * 
 * @since 1.0
 * 
 */
public class BasicQwakJqGridSort implements QwakJqGridSort {
    private String  sortColumn;
    private boolean isAscending;

    public BasicQwakJqGridSort(String column, String direction) {
        sortColumn = column;
        isAscending = direction.equals("asc");
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.quine.qwak.util.QwakJqGridSort#getSortColumn()
     */
    @Override
    public String getSortColumn() {
        return sortColumn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.quine.qwak.util.QwakJqGridSort#isAscending()
     */
    @Override
    public boolean isAscending() {
        return isAscending;
    }
}