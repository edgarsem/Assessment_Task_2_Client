<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:ns="http://spring.io/guides/gs-producing-web-service">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>

    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="1cm" margin-left="1cm" margin-right="1cm">
                    <fo:region-body margin-top="2cm"/>
                    <fo:region-before extent="2cm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="simple">
                <fo:static-content flow-name="xsl-region-before">
                    <fo:block font-size="14pt" font-weight="bold" text-align="center">Movie List</fo:block>
                </fo:static-content>
                <fo:flow flow-name="xsl-region-body">
                    <fo:block font-size="12pt">
                        <xsl:apply-templates select="/ns:movies/ns:movie"/>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template match="ns:movie">
        <fo:block font-size="12pt" space-after="0.1em">
            <fo:block font-weight="bold" font-size="16pt" space-after="0.5em"><xsl:value-of select="ns:title"/></fo:block>
            <fo:block font-size="12pt" space-after="0.25em"><xsl:value-of select="ns:length"/> minutes</fo:block>
            <fo:block font-size="12pt" space-after="0.25em">
                <xsl:for-each select="ns:genres/ns:genre">
                    <fo:inline border="1px solid #D3D3D3" padding="2px" >
                        <xsl:value-of select="ns:category"/>
                    </fo:inline>
                    <xsl:text> </xsl:text>
                </xsl:for-each>
            </fo:block>

            <fo:block font-weight="bold" font-size="12pt" space-after="0.25em">
                Directors:
                <xsl:for-each select="ns:directors/ns:director">
                    <fo:inline font-weight="normal">
                        <xsl:value-of select="ns:name"/>
                        <xsl:text> </xsl:text>
                        <xsl:value-of select="ns:lastName"/>
                        <xsl:if test="position() != last()">, </xsl:if>
                    </fo:inline>
                </xsl:for-each>
            </fo:block>

            <fo:block font-weight="bold" font-size="12pt" space-after="1.25em">
                Writers:
                <xsl:for-each select="ns:writers/ns:writer">
                    <fo:inline font-weight="normal">
                        <xsl:value-of select="ns:name"/>
                        <xsl:text> </xsl:text>
                        <xsl:value-of select="ns:lastName"/>
                        <xsl:if test="position() != last()">, </xsl:if>
                    </fo:inline>
                </xsl:for-each>
            </fo:block>


            <fo:block font-size="14pt" font-weight="bold" space-after="0.25em">
                Top Cast:
            </fo:block>
            <fo:table table-layout="fixed" width="30%" space-after="0.5em">
                <fo:table-column column-width="proportional-column-width(1)"/>
                <fo:table-body>
                    <xsl:for-each select="ns:cast/ns:actor">
                        <fo:table-row>
                            <fo:table-cell>
                                <fo:block-container border="1pt solid darkgrey" padding="0.5em">
                                    <fo:block font-size="12pt" text-align="center">
                                        <xsl:value-of select="ns:name"/>
                                        <xsl:text> </xsl:text>
                                        <xsl:value-of select="ns:lastName"/>
                                    </fo:block>
                                </fo:block-container>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:for-each>
                </fo:table-body>
            </fo:table>


            <fo:block>
                <fo:inline font-weight="bold">Reviews:</fo:inline>
                <fo:block space-before="7pt"/>
                <xsl:for-each select="ns:reviews/ns:review">
                    <fo:block font-weight="bold">
                        <xsl:for-each select="ns:user">
                            <fo:inline font-size="11pt" font-weight="normal">
                                User:
                                <xsl:value-of select="ns:name"/>
                                <xsl:text> </xsl:text>
                                <xsl:value-of select="ns:lastName"/>
                            </fo:inline>
                        </xsl:for-each>
                    </fo:block>
                    <fo:block font-size="14pt">
                        <xsl:value-of select="ns:criticism"/>
                    </fo:block>
                    <fo:block>
                        Score: <xsl:value-of select="ns:rating"/>
                    </fo:block>
                    <fo:block space-after="4pt"/>
                </xsl:for-each>
            </fo:block >

            <fo:block space-after="12pt"/>

        </fo:block>
    </xsl:template>

</xsl:stylesheet>
