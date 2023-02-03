# Properties of Discrete Cosine Transform (DCT)

The basic function of DCT is to transform signals from the spatial representation into the frequency
representation.Discrete cosine transforms (DCT) algorithm helps to improve the result performance under large illumination variations. It is found that by discarding low-frequency DCT coefficients in the logarithm domain, the method capable of reducing the illumination variations effect significantly. The advantages of this method are no modelling step and bootstrap sets are required.Some of its key properties are:

- Linearity: DCT is a linear transform, meaning that the output is a linear combination of the inputs.

- Orthogonality: The DCT basis functions are orthogonal, meaning that they are perpendicular to each other.

- Energy Preservation: The DCT transform preserves the energy of the signal, meaning that the sum of the squares of the transformed coefficients is equal to the sum of the squares of the original signal.

- Shift-Invariance: The DCT transform is shift-invariant, meaning that shifting the signal in time has no effect on the transform.

- Time-Frequency Analysis: The DCT provides a representation of the signal in the frequency domain, which can be used for time-frequency analysis.


# Properties of the Fourier Transform

Fourier Transform is a mathematical model which helps to transform the signals between two different domains, such as transforming signal from frequency domain to time domain or vice versa.

- Linearity: For any functions 𝑓(𝑥) and 𝑔(𝑥) for which the Fourier transform exists and constant  𝑎, we have
  ` 𝐹[𝑓+𝑔]=𝐹[𝑓]+𝐹[𝑔] and 𝐹[𝑎𝑓]=𝑎𝐹[𝑓].`
 
    It follow from the properties of integration and establish the linearity of the Fourier transform.

- Orthogonality: The FT basis functions are orthogonal, meaning that they are perpendicular to each other.

- Periodicity: The FT is periodic in nature, meaning that the transform repeats after a certain period.

- Shift-Invariance: The FT is shift-invariant, meaning that shifting the signal in time has no effect on the transform.

- Energy Preservation: The FT preserves the energy of the signal, meaning that the sum of the squares of the transformed coefficients is equal to the sum of the squares of the original signal.

- Time-Frequency Analysis: The FT provides a representation of the signal in the frequency domain, which can be used for time-frequency analysis.


# Properties of the Harr Transform

The Haar Transform is a type of wavelet transform that provides a representation of a signal in terms of its frequency components, like the Fourier Transform. However, unlike the Fourier Transform, the Haar Transform provides a multi-resolution representation of the signal, meaning that it can be applied at multiple levels to reveal different levels of detail in the signal. This makes the Haar Transform particularly useful in image processing, where it is often used for image compression and denoising.

- Orthogonality: The Haar basis functions are orthogonal, meaning that they are perpendicular to each other.

- Energy Preservation: The Haar transform preserves the energy of the signal, meaning that the sum of the squares of the transformed coefficients is equal to the sum of the squares of the original signal.

- Multi-Resolution Analysis: The Haar transform provides a multi-resolution representation of the signal, meaning that the transform can be applied at multiple levels to reveal different levels of detail in the signal.

- Time-Frequency Analysis: The Haar transform provides a representation of the signal in the frequency domain, which can be used for time-frequency analysis.

- Computational Efficiency: The Haar transform is computationally efficient, meaning that it requires fewer computations than other wavelet transforms, such as the Discrete Wavelet Transform (DWT).

# Properties of Hadamard Transform

The Hadamard transform (also known as the Walsh–Hadamard transform, Hadamard–Rademacher–Walsh transform, Walsh transform, or Walsh–Fourier transform) is an example of a generalized class of Fourier transforms. It performs an orthogonal, symmetric, involutive, linear operation on 2m real numbers (or complex, or hypercomplex numbers, although the Hadamard matrices themselves are purely real).

- Orthogonality: The Hadamard matrix is orthogonal, meaning that its transpose is equal to its inverse. This property ensures that the transformed coefficients are uncorrelated, which makes it easier to analyze the frequency content of the signal.

- Energy Preservation: The Hadamard Transform preserves the energy of the signal, meaning that the sum of the squares of the transformed coefficients is equal to the sum of the squares of the original signal.

- Symmetry: The Hadamard Transform is symmetric, meaning that the transform of a signal is the same as the transform of its time-reversed version.

- Computational Efficiency: The Hadamard Transform is computationally efficient, meaning that it requires fewer computations than other transforms, such as the Fourier Transform. This makes it a practical choice for real-time applications where computational speed is important.

---
## Reference Links
[Discrete Cosine Transform](https://iopscience.iop.org/article/10.1088/1757-899X/557/1/012027/pdf)

[Properties of the Fourier Transform](https://math.libretexts.org/Bookshelves/Differential_Equations/Introduction_to_Partial_Differential_Equations_(Herman)/09%3A_Transform_Techniques_in_Physics/9.05%3A_Properties_of_the_Fourier_Transform)

[Fourier Transform](https://byjus.com/maths/fourier-transform/)

[Hadamard transform](https://en.wikipedia.org/wiki/Hadamard_transform#:~:text=The%20Hadamard%20transform%20can%20be,a%20superposition%20of%20Walsh%20functions.)

[Properties of Hadamard transform](https://www.commsp.ee.ic.ac.uk/~tania/teaching/DIP%202014/DIP%20DHT%202018.pdf)
[ChatGPT](https://chat.openai.com)
