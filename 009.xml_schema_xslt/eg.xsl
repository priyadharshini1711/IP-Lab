<?xml version="1.0" encoding="ISO-8859-1"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns="http://www.w3.org/1999/xhtml">
    <body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">
        <center>
            <h4>List of food items</h4>
            <table border="2 px">
                <xsl:for-each select="breakfast_menu/food">
                    <tr>
                        <td>
                            <xsl:value-of select="name" />
                        </td>
                        <td>
                            <xsl:value-of select="price" />
                        </td>
                        <td>
                            <xsl:value-of select="description" />
                        </td>
                        <td><xsl:value-of select="calories" />(calories per serving)</td>
                    </tr>
                </xsl:for-each>
            </table>
        </center>
    </body>
</html>