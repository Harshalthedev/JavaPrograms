import pandas as pd
import numpy as np

# Set the number of rows for the dataset
num_rows = 1000

# Generate random values for each parameter
depth = np.random.uniform(50, 70, num_rows)
table = np.random.uniform(50, 70, num_rows)
length = np.random.uniform(3, 10, num_rows)
width = np.random.uniform(3, 10, num_rows)
height = np.random.uniform(1, 5, num_rows)
cut_grade = np.random.choice(['Ideal', 'Premium', 'Very Good', 'Good', 'Fair'], num_rows)
polish_grade = np.random.choice(['Ideal', 'Excellent', 'Very Good', 'Good', 'Fair'], num_rows)
fluorescence = np.random.choice(['None', 'Faint', 'Medium', 'Strong'], num_rows)
girdle = np.random.choice(['Thin', 'Medium', 'Thick'], num_rows)
culet = np.random.choice(['None', 'Small', 'Medium', 'Large'], num_rows)
length_cw_ratio = length / width
width_cw_ratio = width / length
height_cw_ratio = height / width
ang_pav_polish = np.random.uniform(0, 10, num_rows)
ang_girdle = np.random.uniform(0, 10, num_rows)
ang_culet = np.random.uniform(0, 10, num_rows)
authentic = np.random.choice([0, 1], num_rows)  # 0 for fake, 1 for real

# Create a DataFrame
data = pd.DataFrame({
    'Depth': depth,
    'Table': table,
    'Length': length,
    'Width': width,
    'Height': height,
    'Cut_Grade': cut_grade,
    'Polish_Grade': polish_grade,
    'Fluorescence': fluorescence,
    'Girdle': girdle,
    'Culet': culet,
    'Length_CW_Ratio': length_cw_ratio,
    'Width_CW_Ratio': width_cw_ratio,
    'Height_CW_Ratio': height_cw_ratio,
    'Ang_Pav_Polish': ang_pav_polish,
    'Ang_Girdle': ang_girdle,
    'Ang_Culet': ang_culet,
    'Authentic': authentic
})

# Save the dataset to a CSV file
data.to_csv('diamond_dataset.csv', index=False)
