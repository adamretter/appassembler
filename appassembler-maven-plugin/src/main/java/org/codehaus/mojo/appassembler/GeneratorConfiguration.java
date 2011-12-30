/**
 *
 * The MIT License
 *
 * Copyright 2006-2011 The Codehaus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.codehaus.mojo.appassembler;

import java.util.List;
import java.util.Properties;

public class GeneratorConfiguration
{
    private String generator;

    private Properties configuration;

    /**
     * The platforms to be included in the generator. This is currently only used in JSW generator. Options are:
     * "linux-ppc-64", "linux-x86-32", "linux-x86-64", "macosx-ppc-32", "macosx-x86-universal-32", "solaris-sparc-32",
     * "solaris-sparc-64", "solaris-x86-32", "windows-x86-32
     */
    private List includes;

    public String getGenerator ()
    {
        return generator;
    }

    public void setGenerator ( String generator )
    {
        this.generator = generator;
    }

    public Properties getConfiguration ()
    {
        return configuration;
    }

    public void setConfiguration ( Properties configuration )
    {
        this.configuration = configuration;
    }

    public String toString ()
    {
        return "generator = " + generator + "; configuration = " + configuration;
    }

    public List getIncludes ()
    {
        return includes;
    }

    public void setIncludes ( List includes )
    {
        this.includes = includes;
    }
}
