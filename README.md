# EDA22A-Lab04
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Sort y Listas Enlazadas</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>04</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>13-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>9 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
            <ol>
            <li>Lista Enlazada:<br>
            <p>Para hacer uso del ordenamiento por inserción se utilizó el siguiente código:<p>
            <pre>
int key;
int i;
for (int j=1; j<a.length(); j=j+1) {
		key = a.getInd(j);
		i=j-1;
	while(i>-1 && a.getInd(i)>key) {
		a.remove(i+1);
		a.insertPos(a.getInd(i), i+1);
		i = i-1;
	}
	a.remove(i+1);
	a.insertPos(key, i+1);
}</pre>
            <p>El cual ordena la lista enlazada haciendo uso de sus métodos de clase.</li>
            <li>Doble Lista Enlazada:<br>
            <p>Se utilizó el mismo código ya visto la diferencia se encuentra en sus métodos de clase que cambian debido a ser doble lista enlazada.</li>
            <li>Funcionamiento:<br>
            <p>Se crea una lista y se le agrega elementos con lista.insert(número), luego se manda la lista a ordenar con insertionSort(lista) y se imprime, este funcionamiento se aplica para los 2 ejercicios.
            <pre>
ListaEnlazada<Integer> list = new ListaEnlazada<Integer>();
list.insert(10);
list.insert(8);
list.insert(19);
list.insert(18);
list.insert(9);
System.out.println(list);
InsertionSort(list);
System.out.println(list);</pre></li>
            </ol>
            </td> 
        </tr>
        <tr>
            <td>
            II. SOLUCIÓN DEL CUESTIONARIO<br>
            <ul>
                <li><b>¿Cómo se ejecutaría sus implementaciones desde terminal(consola)?</b></li>
                <p>Para implementar desde consola se utilizarían los siguientes comandos:
                para compilar el archivo sería:<br>
                javac -cp PATH_TO_JAVAPLOT/dist/JavaPlot.jar “nombre del archivo”.java<br>
                y para correrlo se utilizará:<br>
                java -cp PATH_TO_JAVAPLOT/dist/JavaPlot.jar:. “nombre del archivo”<br>
            </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Las listas enlazadas también pueden ser ordenadas, dando así una mejora en su funcionamiento pues pueden llegar a servir</li>
                    <li>Las dobles listas enlazadas necesitan de una 2 nodos los cuales hacen más potente las funcionalidades de esta lista.</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                -Escobedo, R., 2022. pw2/labs/lab03 at main · rescobedoq/pw2. [online] GitHub. Available at: https://github.com/rescobedoq/pw2/tree/main/labs/lab03.<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html<br>
                -https://javaplot.panayotis.com/example.html<br> 
            </td>
        </tr>
    </tbody>
</table>